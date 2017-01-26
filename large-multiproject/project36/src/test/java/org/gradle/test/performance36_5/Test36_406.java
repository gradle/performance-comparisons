package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_406 {
    private final Production36_406 production = new Production36_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}