package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_72 {
    private final Production39_72 production = new Production39_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}