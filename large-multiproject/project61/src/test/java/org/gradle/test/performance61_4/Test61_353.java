package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_353 {
    private final Production61_353 production = new Production61_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}