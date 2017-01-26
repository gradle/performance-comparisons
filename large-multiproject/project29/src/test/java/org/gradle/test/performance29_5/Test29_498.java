package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_498 {
    private final Production29_498 production = new Production29_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}