package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_225 {
    private final Production49_225 production = new Production49_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}