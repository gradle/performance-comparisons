package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_353 {
    private final Production27_353 production = new Production27_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}