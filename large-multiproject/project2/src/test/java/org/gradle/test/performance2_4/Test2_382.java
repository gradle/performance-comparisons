package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_382 {
    private final Production2_382 production = new Production2_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}