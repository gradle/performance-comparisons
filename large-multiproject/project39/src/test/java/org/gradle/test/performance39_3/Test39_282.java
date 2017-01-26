package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_282 {
    private final Production39_282 production = new Production39_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}