package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_89 {
    private final Production29_89 production = new Production29_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}