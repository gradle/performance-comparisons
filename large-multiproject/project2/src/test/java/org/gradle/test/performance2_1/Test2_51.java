package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_51 {
    private final Production2_51 production = new Production2_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}