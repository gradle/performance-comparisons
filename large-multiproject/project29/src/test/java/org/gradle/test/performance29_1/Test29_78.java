package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_78 {
    private final Production29_78 production = new Production29_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}