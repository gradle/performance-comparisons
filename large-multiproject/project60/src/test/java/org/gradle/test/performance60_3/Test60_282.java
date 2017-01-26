package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_282 {
    private final Production60_282 production = new Production60_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}