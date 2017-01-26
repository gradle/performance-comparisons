package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_119 {
    private final Production73_119 production = new Production73_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}