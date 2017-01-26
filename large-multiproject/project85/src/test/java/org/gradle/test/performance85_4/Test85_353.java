package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_353 {
    private final Production85_353 production = new Production85_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}