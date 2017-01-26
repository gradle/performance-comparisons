package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_85 {
    private final Production60_85 production = new Production60_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}