package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_406 {
    private final Production11_406 production = new Production11_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}