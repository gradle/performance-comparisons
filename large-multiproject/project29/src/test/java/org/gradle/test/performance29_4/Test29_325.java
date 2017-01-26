package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_325 {
    private final Production29_325 production = new Production29_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}