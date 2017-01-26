package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_353 {
    private final Production60_353 production = new Production60_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}