package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_406 {
    private final Production19_406 production = new Production19_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}