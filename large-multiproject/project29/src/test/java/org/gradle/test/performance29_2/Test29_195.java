package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_195 {
    private final Production29_195 production = new Production29_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}