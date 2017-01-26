package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_406 {
    private final Production65_406 production = new Production65_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}