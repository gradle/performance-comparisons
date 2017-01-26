package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_331 {
    private final Production29_331 production = new Production29_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}