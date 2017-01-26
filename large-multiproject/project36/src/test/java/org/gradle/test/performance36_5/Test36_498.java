package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_498 {
    private final Production36_498 production = new Production36_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}