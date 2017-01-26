package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_77 {
    private final Production18_77 production = new Production18_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}