package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_172 {
    private final Production29_172 production = new Production29_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}