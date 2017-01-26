package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_338 {
    private final Production2_338 production = new Production2_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}