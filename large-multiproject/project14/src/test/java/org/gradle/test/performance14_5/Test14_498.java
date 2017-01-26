package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_498 {
    private final Production14_498 production = new Production14_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}