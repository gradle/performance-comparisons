package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_406 {
    private final Production59_406 production = new Production59_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}