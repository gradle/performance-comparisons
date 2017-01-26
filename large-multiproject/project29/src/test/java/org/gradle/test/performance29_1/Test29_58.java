package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_58 {
    private final Production29_58 production = new Production29_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}