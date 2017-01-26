package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_282 {
    private final Production72_282 production = new Production72_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}