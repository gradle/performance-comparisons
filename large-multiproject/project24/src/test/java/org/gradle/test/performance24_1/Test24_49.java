package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_49 {
    private final Production24_49 production = new Production24_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}