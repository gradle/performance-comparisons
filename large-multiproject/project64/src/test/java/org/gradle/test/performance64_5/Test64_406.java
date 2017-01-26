package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_406 {
    private final Production64_406 production = new Production64_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}