package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_498 {
    private final Production99_498 production = new Production99_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}