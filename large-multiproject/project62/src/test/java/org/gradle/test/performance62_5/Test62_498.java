package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_498 {
    private final Production62_498 production = new Production62_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}