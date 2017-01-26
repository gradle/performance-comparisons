package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_353 {
    private final Production15_353 production = new Production15_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}