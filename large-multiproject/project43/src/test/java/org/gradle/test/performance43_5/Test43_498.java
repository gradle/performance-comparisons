package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_498 {
    private final Production43_498 production = new Production43_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}