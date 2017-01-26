package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_347 {
    private final Production29_347 production = new Production29_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}