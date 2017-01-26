package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_347 {
    private final Production49_347 production = new Production49_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}