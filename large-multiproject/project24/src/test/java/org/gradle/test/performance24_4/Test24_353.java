package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_353 {
    private final Production24_353 production = new Production24_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}