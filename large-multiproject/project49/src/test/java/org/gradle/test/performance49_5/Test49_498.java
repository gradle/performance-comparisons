package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_498 {
    private final Production49_498 production = new Production49_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}