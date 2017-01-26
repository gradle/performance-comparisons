package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_353 {
    private final Production83_353 production = new Production83_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}