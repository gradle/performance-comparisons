package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_225 {
    private final Production60_225 production = new Production60_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}