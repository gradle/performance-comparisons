package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_406 {
    private final Production1_406 production = new Production1_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}