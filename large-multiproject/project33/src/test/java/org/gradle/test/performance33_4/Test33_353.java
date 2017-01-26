package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_353 {
    private final Production33_353 production = new Production33_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}