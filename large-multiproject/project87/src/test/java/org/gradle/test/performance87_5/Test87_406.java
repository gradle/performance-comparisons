package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_406 {
    private final Production87_406 production = new Production87_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}