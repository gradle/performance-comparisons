package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_498 {
    private final Production63_498 production = new Production63_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}