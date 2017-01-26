package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_72 {
    private final Production29_72 production = new Production29_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}