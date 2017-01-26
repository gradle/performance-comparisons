package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_406 {
    private final Production91_406 production = new Production91_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}