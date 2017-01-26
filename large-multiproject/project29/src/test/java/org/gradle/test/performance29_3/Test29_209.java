package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_209 {
    private final Production29_209 production = new Production29_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}