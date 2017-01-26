package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_267 {
    private final Production49_267 production = new Production49_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}