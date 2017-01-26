package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_498 {
    private final Production90_498 production = new Production90_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}