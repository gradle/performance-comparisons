package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_437 {
    private final Production29_437 production = new Production29_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}