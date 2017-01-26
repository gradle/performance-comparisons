package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_229 {
    private final Production49_229 production = new Production49_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}