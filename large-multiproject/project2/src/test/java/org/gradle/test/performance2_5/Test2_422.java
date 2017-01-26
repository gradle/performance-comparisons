package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_422 {
    private final Production2_422 production = new Production2_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}