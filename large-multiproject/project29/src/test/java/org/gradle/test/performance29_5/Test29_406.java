package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_406 {
    private final Production29_406 production = new Production29_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}