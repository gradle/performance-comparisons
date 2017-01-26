package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_225 {
    private final Production24_225 production = new Production24_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}