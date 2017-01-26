package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_45 {
    private final Production18_45 production = new Production18_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}