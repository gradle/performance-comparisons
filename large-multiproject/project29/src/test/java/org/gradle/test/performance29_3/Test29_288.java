package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_288 {
    private final Production29_288 production = new Production29_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}